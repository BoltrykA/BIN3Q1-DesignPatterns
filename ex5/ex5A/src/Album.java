public class Album {
    private final String titre; // obligatoire
    private final String nomArtiste; // obligatoire
    private final String labelMarqueDeDisque;
    private final String producteur;
    private final String paysArtiste;
    private final String version;
    private final String genre;
    private final int anneeParution;
    private final int anneeParutionOriginale; // si album remasterise
    private final int debitStandard;
    private final int debitPremium;

    private Album(AlbumBuilder builder){
        this.titre = builder.titre;
        this.nomArtiste = builder.nomArtiste;
        this.labelMarqueDeDisque = builder.labelMarqueDeDisque;
        this.producteur = builder.producteur;
        this.paysArtiste = builder.paysArtiste;
        this.version = builder.version;
        this.genre = builder.genre;
        this.anneeParution = builder.anneeParution;
        this.anneeParutionOriginale = builder.anneeParutionOriginale;
        this.debitStandard = builder.debitStandard;
        this.debitPremium = builder.debitPremium;
    }

    public String getTitre() {
        return titre;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }

    public String getLabelMarqueDeDisque() {
        return labelMarqueDeDisque;
    }

    public String getProducteur() {
        return producteur;
    }

    public String getPaysArtiste() {
        return paysArtiste;
    }

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public int getAnneeParutionOriginale() {
        return anneeParutionOriginale;
    }

    public int getDebitStandard() {
        return debitStandard;
    }

    public int getDebitPremium() {
        return debitPremium;
    }

    public static class AlbumBuilder {
        private final String titre; // obligatoire
        private final String nomArtiste; // obligatoire
        private String labelMarqueDeDisque;
        private String producteur;
        private String paysArtiste;
        private String version;
        private String genre;
        private int anneeParution;
        private int anneeParutionOriginale; // si album remasterise
        private int debitStandard;
        private int debitPremium;

        public AlbumBuilder(String titre, String nomArtiste){
            this.titre = titre;
            this.nomArtiste = nomArtiste;
        }

        public AlbumBuilder labelMarqueDeDisque(String labelMarqueDeDisque){
            this.labelMarqueDeDisque = labelMarqueDeDisque;
            return this;
        }

        public AlbumBuilder producteur(String producteur){
            this.producteur = producteur;
            return this;
        }

        public AlbumBuilder version(String version){
            this.version = version;
            return this;
        }

        public AlbumBuilder paysArtiste(String paysArtiste){
            this.paysArtiste = paysArtiste;
            return this;
        }

        public AlbumBuilder genre(String genre){
            this.genre = genre;
            return this;
        }

        public AlbumBuilder anneeParution(int anneeParution){
            this.anneeParution = anneeParution;
            return this;
        }

        public AlbumBuilder anneeParutionOriginale(int anneeParutionOriginale){
            this.anneeParutionOriginale = anneeParutionOriginale;
            return this;
        }

        public AlbumBuilder debitStandard(int debitStandard){
            this.debitStandard = debitStandard;
            return this;
        }

        public AlbumBuilder debitPremium(int debitPremium){
            this.debitPremium = debitPremium;
            return this;
        }

        public Album build(){
            return new Album(this);
        }


    }
}
