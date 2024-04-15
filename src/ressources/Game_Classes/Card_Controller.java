package ressources.Game_Classes;
import javax.swing.*;
import java.awt.*;
public class Card_Controller {

    private enum Card_Arcana{
        MAJOR("Major"), MINOR("Minor");

        private String type;
        Card_Arcana(String type){
            this.type = type;
        }

        public String getType(){
            return this.type;
        }
    }

    //Enum des Major Arcana 
    private enum MajorCard{
        FOOl(0,"The Fool", "Blissful ignorance",5,5,5,"FOOL.png");
        //Don't change the list of cards yet I'm testing
        private int id;
        private String name;
        private String description;
        private String imagePath;
        private int cost;
        private int attack;
        private int health;
        private boolean isMajor = true;

        MajorCard(int id, String name, String description, int cost, int attack, int health, String imgPath){
            this.id = id;
            this.name = name;
            this.description = description;
            this.cost = cost;
            this.attack = attack;
            this.health = health;
            this.imagePath = "MajorArcana/"+imgPath;
        };

        public int getId() {
            return this.id;
        }
    
        public String getName() {
            return this.name;
        }
    
        public String getDescription() {
            return this.description;
        }
    
        public String getImagePath() {
            return this.imagePath;
        }
    
        public int getCost() {
            return this.cost;
        }
    
        public int getAttack() {
            return this.attack;
        }
    
        public int getHealth() {
            return this.health;
        }
    
        public boolean isMajor() {
            return this.isMajor;
        }
    }

    private enum Value{}

    private enum Suit{}


    private enum MinorCard{
        ACE_CUPS(101, "Ace of cups", "Fortune in Health",1,1,1);


        private int id;
        private String name;
        private Suit suit;
        private Value value;
        private String description;
        private String imagePath;
        private int cost;
        private int attack;
        private int health;
        private boolean isMajor = false;

        MinorCard(int id, String name, String description, int cost, int attack, int health){
            this.id = id;
            this.name = name;
            this.description = description;
            this.cost = cost;
            this.attack = attack;
            this.health = health;
        }
        
        public int getId() {
            return this.id;
        }
    
        public String getName() {
            return this.name;
        }
    
        public String getDescription() {
            return this.description;
        }
    
        public String getImagePath() {
            return this.imagePath;
        }
    
        public int getCost() {
            return this.cost;
        }
    
        public int getAttack() {
            return this.attack;
        }
    
        public int getHealth() {
            return this.health;
        }
    
        public boolean isMajor() {
            return this.isMajor;
        }
    }

    private enum Effects{
        STUN(0,"Stun",true);

        private int id;
        private String name;
        private boolean isActivable;
        Effects(int id, String name, boolean isActivable){
            this.id = id;
            this.name = name;
            this.isActivable = isActivable;
        }
        // Getter methods
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public boolean isActivable() {
            return isActivable;
        }
    
        // Setter methods
        public void setId(int id) {
            this.id = id;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public void setActivable(boolean activable) {
            isActivable = activable;
        }
    }

    public Card_Arcana getArcana(boolean b){
        return b ? Card_Arcana.MAJOR : Card_Arcana.MINOR;
    }


    public Card makeCard(Card_Arcana cArcana, int id){
        if(cArcana.getType()=="Major"){
            for(MajorCard majCard : MajorCard.values()){
                if(majCard.id == id){
                    return new MajCard(majCard.id, majCard.name, majCard.description, majCard.imagePath, majCard.cost, majCard.attack, majCard.health, majCard.imagePath);
                }
            }
        }
        else if(cArcana.getType()=="Minor"){
            for(MinorCard minCard : MinorCard.values()){
                if(minCard.id == id){
                    return new MinCard(minCard.id, minCard.name, minCard.description, minCard.imagePath, minCard.cost, minCard.attack, minCard.health);
                }
            }
        }
        return null;

    }

}
