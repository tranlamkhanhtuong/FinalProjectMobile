package uitcourse.j11.nt118.appmusichtcl.Service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import uitcourse.j11.nt118.appmusichtcl.Model.Album;
import uitcourse.j11.nt118.appmusichtcl.Model.Baihat;
import uitcourse.j11.nt118.appmusichtcl.Model.ChudeTheloai;
import uitcourse.j11.nt118.appmusichtcl.Model.Playlist;
import uitcourse.j11.nt118.appmusichtcl.Model.Quangcao;
import uitcourse.j11.nt118.appmusichtcl.Model.TheLoai;

public interface Dataservice {

    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBaner();

    @GET("playlistforcurrentday.php")
    Call<List<Playlist>> GetPlayListCurrentDay();

    @GET("chudevatheloai.php")
    Call<ChudeTheloai> GetChuDeTheLoaiCurrentDay();

    @GET("albumhot.php")
    Call<List<Album>> GetAlbumHot();

    @GET("baihatduocthich.php")
    Call<List<Baihat>> GetBaiHatHot();

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaihattheoquangcao(@Field("idquangcao") String idquangcao);

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    Call<List<Baihat>> GetDanhsachbaihattheoplaylist(@Field("idplaylist") String idplaylist);


}
