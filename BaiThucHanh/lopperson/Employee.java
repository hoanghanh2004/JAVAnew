package lopperson;

class Employee extends Person {
    double luong;

    public Employee(String ten, int tuoi) {
        super(ten, tuoi);
    }

    public void datLuong(double luong) {
        this.luong = luong;
    }

    public double layLuong() {
        return luong;
    }
}
