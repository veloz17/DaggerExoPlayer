package com.nuhkoca.myapplication.repository

import com.nuhkoca.myapplication.api.IExoAPI
import com.nuhkoca.myapplication.data.remote.player.PlayerResponse
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Named

/**
 * A repository layer that handles playable content
 *
 * @param iExoAPI represents an instance of [IExoAPI]
 *
 * @author nuhkoca
 */
class PlayerRepository @Inject constructor(@Named("playerService") private val iExoAPI: IExoAPI) {

    /**
     * Returns video result
     *
     * @param videoId indicates the video id
     * @return video result
     */
    fun getPlayableContent(videoId: String): Single<PlayerResponse> {
        return iExoAPI.getPlayableContent(videoId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}
