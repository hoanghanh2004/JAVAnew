package lopperson;

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String tuoi, int ten) {
        super(tuoi, ten);
    }

    public double tinhLuong(int soGioLam, double luongGio) {
        return soGioLam * luongGio;
    }
}

