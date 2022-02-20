package pbo.tugas.konversi;//file paket

    public class Konversi{//class konversi dengan modifier public
        public double celcius;
        public Konversi (double celcius) {//konstructor untuk parameter celcius,ketika dipanggil konstruktor nilai akan di inputkan ke dalam nilai di celcius
            this.celcius=celcius;
        }
        public void InputCelcius(double celcius){//methods untuk menginputkan kembali pada menu ke-2
            this.celcius=celcius;
        }
        public double HasilCelcius() {//methods untuk melihat masukan celcius
            return this.celcius;
        }
        public double HasilFahrenheit() {//methods fahrenheit untuk melakukan operasi menghitung rumus yang telah di tentukan di studi kasus
            return (9 * this.celcius) / 5 + 32;
        }    
        public double HasilReamur() {//methods Reamur untuk melakukan operasi menghitung rumus yang telah di tentukan di studi kasus
            return (4 * this.celcius) / 5;
        }
        public double HasilKelvin() {//methods Kelvin untuk melakukan operasi menghitung rumus yang telah di tentukan di studi kasus
            return this.celcius + 273.15;
        }
    }

