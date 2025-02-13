package robotBuilder;

public class RobotBuilder {
    private String ai;
    private int arms;
    private int legs;
    private boolean voiceRecognition;
    private int batteryLife;

    private RobotBuilder(Builder builder){
        this.ai = builder.ai;
        this.arms = builder.arms;
        this.legs = builder.legs;
        this.voiceRecognition = builder.voiceRecognition;
        this.batteryLife = builder.batteryLife;
    }

    @Override
    public String toString() {
        return "RobotBuilder [ai=" + ai + ", arms=" + arms + ", legs=" + legs + ", voiceRecognition=" + voiceRecognition
                + ", batteryLife=" + batteryLife + "]";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String ai;
        private int arms;
        private int legs;
        private boolean voiceRecognition;
        private int batteryLife;
        
        public Builder setAI(String ai){
            this.ai = ai;
            return this;
        }
        public Builder setArms(int arms){
            this.arms = arms;
            return this;
        }
        public Builder setLegs(int legs){
            this.legs = legs;
            return this;
        }
        public Builder setVoiceReognition(boolean voiceRecognition){
            this.voiceRecognition = voiceRecognition;
            return this;
        }
        public Builder setBatteryLife(int batteryLife){
            this.batteryLife = batteryLife;
            return this;
        }

        public RobotBuilder builder(){
            return new RobotBuilder(this);
        }
    }
}
