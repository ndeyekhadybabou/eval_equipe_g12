public class Parametres {
    public static final int GROUPE = 12;

    public static final int TAUX_FRAIS = 10 + GROUPE % 6;

    public static final long PLAFOND_RETRAIT =
            150000 + 10000L * (GROUPE % 8);

    public static final long SEUIL_PREMIUM = 50000;

    public static final int CAPACITE = 20;
}
