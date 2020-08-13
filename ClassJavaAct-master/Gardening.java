public class Gardening {

    String tools;
    String plants;
    int temperature;
    
    public Gardening(String toolsNeeded, String plantSeeds, int tempToday){
        tools = toolsNeeded;
        plants = plantSeeds;
        temperature = tempToday;
    }

    public String newTools(String newThing){
        tools = tools + newThing;
        String newToolbox = "I'll now need a new " + newThing + ", that's in my toolbox now!";
        return newToolbox;
    }


    public static void main(String[] args){

        Gardening hobby = new Gardening("trowel, fork, gloves, compost", "basil, roses, grass", 30);
        Gardening job = new Gardening("mower, leaf blower, spade", "wheat, barley, rye", 20);

        System.out.println("I'm ready to garden! I have my " + hobby.tools);
        System.out.println("Is it too hot to garden?");
        System.out.println(hobby.temperature >= 20);
        System.out.println("I'm going to plant " + hobby.plants);
        System.out.println("When I go professional, I'll need a " + job.tools);
        
        /*String hi = "hello";
        String bye = "bye";
        System.out.println(hi.equals(bye)); */


        String newToolMessage = job.newTools("rake");
        System.out.println(newToolMessage);

    }

}