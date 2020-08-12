public class Gardening {

    String tools;
    String plants;
    int temperature;
    
    public Gardening(String toolsNeeded, String plantSeeds, int tempToday){
        tools = toolsNeeded;
        plants = plantSeeds;
        temperature = tempToday;
    }

    public static void main(String[] args){

        Gardening hobby = new Gardening("trowel, fork, gloves, compost", "basil, roses, grass", 30);
        Gardening job = new Gardening("mower, leaf blower, spade", "wheat, barley, rye", 20);

        System.out.println("I'm ready to garden! I have my " + hobby.tools);
        System.out.println("Is it too hot to garden?");
        System.out.println(hobby.temperature >= 20);
        System.out.println("I'm going to plant " + hobby.plants);


    }

}