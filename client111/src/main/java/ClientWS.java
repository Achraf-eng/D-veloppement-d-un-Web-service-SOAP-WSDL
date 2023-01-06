import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS {
    public static void main(String[] args) {
        //on vient de créer un middleware
        // grace à ce objet l'app peut communiquer avec web service facilement
        // c'est la programmation orienté objet distribué
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(234));
    }
}
