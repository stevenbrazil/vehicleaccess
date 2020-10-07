public class Vehicle {

        public long model_year;
        public String make;
        public String model;
        public String gasType;

        public void setModel_year(long year){

            this.model_year = year;
        }

        public void setMake(String make){

            this.make = make;
        }

        public void setModel(String model){

            this.model = model;
        }

        public void setGasType(String fuel){

            this.gasType = fuel;
        }

        public long getModel_year(){

            return this.model_year;
        }

        public String getMake(){

            return this.make;
        }

        public String getModel(){

            return this.model;
        }

        public String getGasType(){

            return this.gasType;
        }






}
