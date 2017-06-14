package co.edu.sena.programming.anonimas.ejemplo02;

/**
 * Created by Enrique on 14/06/2017.
 */
public class ClaseUno {

    public InterfaceClaseDos getClaseDos(){
        return new ClaseDos();
    }

    private class ClaseDos implements InterfaceClaseDos{

        public InterfaceClaseTres getClaseTres(){
            return new ClaseTres();
        }

        private class ClaseTres implements InterfaceClaseTres{

            public InterfaceClaseCuatro getClaseCuatro(){
                return new ClaseCuatro();
            }

            private class ClaseCuatro implements InterfaceClaseCuatro{

            }

        }

    }

}
