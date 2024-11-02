public class SalaDeCinema{
        private int numero;
        private int CapaciadeMaxClientes;

        public SalaDeCinema(int numero, int CapaciadeMaxClientes){
            this.numero = numero;
            this.CapaciadeMaxClientes = CapaciadeMaxClientes;

        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCapaciadeMaxClientes() {
            return CapaciadeMaxClientes;
        }

        public void setCapaciadeMaxClientes(int capaciadeMaxClientes) {
            CapaciadeMaxClientes = capaciadeMaxClientes;
        }
    }
