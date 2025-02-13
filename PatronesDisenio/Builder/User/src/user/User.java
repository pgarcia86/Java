package user;

public class User {
    private String name;
    private String email;
    private String phone;
    private String address;
    private int age;

    private User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", age=" + age
                + "]";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String email;
        private String phone;
        private String address;
        private int age;   
        
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User builder(){
            return new User(this);
        }
    }
}
