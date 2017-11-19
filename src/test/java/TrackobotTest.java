//import com.trackobot.rest.Trackobot;
//
//import org.junit.Test;
//
//import java.security.cert.CertificateException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLSocketFactory;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//
//import okhttp3.Cookie;
//import okhttp3.CookieJar;
//import okhttp3.Credentials;
//import okhttp3.HttpUrl;
//import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
//
///**
// * Created by williamwebb on 4/5/17.
// */
//
//public class TrackobotTest {
//
//  OkHttpClient client = new OkHttpClient.Builder()
//      .addNetworkInterceptor(new HttpLoggingInterceptor(System.out::println).setLevel(HttpLoggingInterceptor.Level.BODY))
//      .build();
//  Trackobot tob = new Trackobot(client, "cool-frog-4524", "Eirtaq_pr6yseWazWaFw");
//
//
//  @Test
//  public void testLadderHistory() {
//    System.out.println(tob.getLadderHistory().blockingFirst());
//  }
//
//  @Test
//  public void testArenaRun() {
//    System.out.println(tob.getArenaRun("1143553").blockingFirst());
//  }
//
//  @Test
//  public void testArenaHistory() {
//    System.out.println(tob.getArenaHistory().blockingFirst());
//  }
//
//  @Test
//  public void testArenaStats() {
//    System.out.println(tob.getStatsArena().blockingFirst());
//  }
//
//  @Test
//  public void testClassesStats() {
////    System.out.println(tob.getArenaClasses().blockingFirst());
//  }
//
//  @Test
//  public void testDecksStats() {
////    System.out.println(tob.getDeckStats().blockingFirst());
//  }
//}
