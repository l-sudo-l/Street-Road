package lugares;

public class Auto {
        private String nombre;
        private int precio;
        private int velocidadMaxima;
        private String motor;
        private String transmision;
        private int tanqueGasolina;

        public Auto(String nombre, int precio, int velocidadMaxima, String motor, String transmision, int tanqueGasolina) {
                this.nombre = nombre;
                this.precio = precio;
                this.velocidadMaxima = velocidadMaxima;
                this.motor = motor;
                this.transmision = transmision;
                this.tanqueGasolina = tanqueGasolina;
        }

        public String getNombre() {
                return nombre;
        }

        public int getPrecio() {
                return precio;
        }

        public int getVelocidadMaxima() {
                return velocidadMaxima;
        }

        public String getMotor() {
                return motor;
        }

        public String getTransmision() {
                return transmision;
        }

        public int getTanqueGasolina(){
                return tanqueGasolina;
        }
}
