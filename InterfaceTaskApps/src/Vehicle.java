//    Vehicle interface-ə bir yeni metod əlavə edin:
//    getFuelType(), hansı ki benzin, dizel və ya elektrik tipini qaytarsın.
//Hər sinifdə bu metodu doldurun və istifadə edin.
//Yeni bir sinif yaradın: ElectricCar, bu sinif də Vehicle interface-ni implement etsin
// və öz metodlarını doldursun.
// Vehicle interfaceq
interface Vehicle {
    void startEngine(); // Abstract metod

    void stopEngine();  // Abstract metod
    String getFuelType(); // Yeni metod
}
