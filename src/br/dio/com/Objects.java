package br.dio.com;

class Car {

    String carModel;
    int carID;
    int carYear;
    float carPrice;

    public String getCarModel () {return carModel;}

    public void setCarModel (String carModel) {
        this.carModel = carModel;
    }

    public int getCarID () {
        return carID;
    }

    public void setCarID (int carID) {
        this.carID = carID;
    }

    public int getCarYear () {
        return carYear;
    }

    public void setCarYear (int carYear){
        this.carYear = carYear;
    }

    public float getCarPrice () {
        return carPrice;
    }

    public void setCarPrice (float carPrice) {
        this.carPrice = carPrice;
    }



    public Car (String carModelVariable, int carIDVariable, int carYearVariable, float carPriceVariable ) {
        carModel = carModelVariable;
        carID = carIDVariable;
        carYear = carYearVariable;
        carPrice = carPriceVariable;
    }

    public String toString () {
        return "Carro número: " + carID + "\nModelo: " + carModel + "\nAno: " + carYear + "\nValor: " + carPrice + "\n--------------";
    }
}
