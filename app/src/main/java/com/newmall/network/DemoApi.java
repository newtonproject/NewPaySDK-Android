package com.newmall.network;

import com.newmall.entity.BaseTransaction;

import org.newtonproject.newpay.android.sdk.bean.NewAuthLogin;
import org.newtonproject.newpay.android.sdk.bean.NewAuthPay;
import org.newtonproject.newpay.android.sdk.bean.NewAuthProof;
import org.newtonproject.newpay.android.sdk.bean.NewSignMessage;
import org.newtonproject.newpay.android.sdk.bean.NewSignTransaction;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author weixuefeng@lubangame.com
 * @version $Rev$
 * @time: 2019-06-18--22:13
 * @description
 * @copyright (c) 2018 Newton Foundation. All rights reserved.
 */
public interface DemoApi {
    @POST("get/client/proof/")
    @FormUrlEncoded
    Observable<BaseResponse<NewAuthProof>> getAuthProof(@Field("newid") String newid, @Field("os") String os);

    @POST("get/client/login/")
    @FormUrlEncoded
    Observable<BaseResponse<NewAuthLogin>> getAuthLogin(@Field("os") String os);

    @POST("get/client/pay/")
    @FormUrlEncoded
    Observable<BaseResponse<NewAuthPay>> getAuthPay(@Field("newid") String newid, @Field("os") String os);

    @POST("get/client/sign/message/")
    @FormUrlEncoded
    Observable<BaseResponse<NewSignMessage>> getSignMessage(@Field("message") String message, @Field("os") String os);

    @POST("get/client/sign/transaction/")
    Observable<BaseResponse<NewSignTransaction>> getSignTransaction(@Body BaseTransaction transaction);
}
