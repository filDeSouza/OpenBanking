package com.openbanking.data.remote;




import com.openbanking.model.bradesco.dependencias.BradescoDependenciasResult;
import com.openbanking.model.bradesco.produtos.BradescoProdutosResult;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenbankingAPI {

    @GET("channels/v1/branches")
    Observable<BradescoDependenciasResult> getAllDependencias(@Query("page") int pagina,
                                                              @Query("page-size") int tamanhoPagina);

    @GET("")
    Call<BradescoProdutosResult> getAllProdutos (@Query("page") int pagina,
                                                 @Query("page-size") int tamanhoPagina);

}
