import robotBuilder.RobotBuilder;

public class main {
    public static void main(String[] args) throws Exception {
        RobotBuilder robot = RobotBuilder.builder()
            .setAI("chatGPT")
            .setArms(5)
            .setBatteryLife(15)
            .setVoiceReognition(false)
            .setLegs(2)
            .builder();

        System.out.println(robot.toString());
    }
}
