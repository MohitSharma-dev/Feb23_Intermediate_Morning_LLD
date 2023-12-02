package Builder;

public class Student {
    int id;
    String name;
    double psp;
    int gradYear;
    String univName;

    // The solution which we were not happy with
//    Student(int id , String name, double psp , int gradYear.... ){
//        // validations
//        // setting
//    }

    private Student(Builder builder){
        /// more validations can be done
        this.name = builder.getName();
        this.univName = builder.getUnivName();
        this.psp = builder.getPsp();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder {

        int id;
        String name;
        double psp;
        int gradYear;
        String univName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public void setUnivName(String univName) {
            this.univName = univName;
        }

        public Student build(){
            // validations
            if(gradYear <= 2021){
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }
    }

}
