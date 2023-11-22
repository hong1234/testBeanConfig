package third.service;

public class Girl {

    public Outfit outfit;

    //public GirlFriend(){
    //}

    public Girl(Outfit outfit){
        this.outfit = outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void outFit(){
        this.outfit.wear();
    }
}
