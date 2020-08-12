

public class Knitting{

    int castOn;
    double finishedProjectLength;
    String needleType;
    String needleAvailable;
    int projectTime;
    
        public Knitting(int castStitches, double lengthCm, String needleNeeded, String needleToHand, int timeRequired){
            castOn = castStitches;
            finishedProjectLength = lengthCm;
            needleType = needleNeeded;
            needleAvailable = needleToHand;
            projectTime = timeRequired;
        }
    
        public static void main(String[] args){
            Knitting pattern = new Knitting(60, 90.4, "five millimetre", "seven millimetre", 180);
            System.out.println("First, cast on " + pattern.castOn + " stitches.");
            System.out.println("Your finished project will be " + pattern.finishedProjectLength + " cm long");
            System.out.println("You need a " + pattern.needleType + " needle");
            System.out.println("Can you complete the pattern with what you have available?");
            System.out.println(pattern.needleAvailable == pattern.needleType);
            System.out.println("You'll have completed this pattern in " + pattern.projectTime + " hours - keep going!");
        
            System.out.println("This is a git test");
        
        }
    
    }