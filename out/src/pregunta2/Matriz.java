package pregunta2;

public class Matriz {
    //tamaño de matriz dimension
    public int n;
    private double[][] x;

    public Matriz(int n) {
        this.n = n;
        x = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = 0.0;
            }
        }
    }

    public Matriz(double[][] x) {
        this.x = x;
        n = x.length;
    }

    public Object clone() {
        Matriz obj = null;
        try {
            obj = (Matriz) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(" no se puede duplicar");
        }
        obj.x = (double[][]) obj.x.clone();
        for (int i = 0; i < obj.x.length; i++) {
            obj.x[i] = (double[]) obj.x[i].clone();
        }
        return obj;
    }

    public static Matriz inversa(Matriz d) {
        int n = d.n;
        Matriz a = (Matriz) d.clone();
        Matriz b = new Matriz(n);
        Matriz c = new Matriz(n);
        for (int i = 0; i < n; i++) {
            b.x[i][i] = 1.0;
        }

        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {

                for (int s = 0; s < n; s++) {
                    b.x[i][s] -= a.x[i][k] * b.x[k][s] / a.x[k][k];
                }

                for (int j = k + 1; j < n; j++) {
                    a.x[i][j] -= a.x[i][k] * a.x[k][j] / a.x[k][k];
                }
            }
        }

        for (int s = 0; s < n; s++) {
            c.x[n - 1][s] = b.x[n - 1][s] / a.x[n - 1][n - 1];
            for (int i = n - 2; i >= 0; i--) {
                c.x[i][s] = b.x[i][s] / a.x[i][i];
                for (int k = n - 1; k > i; k--) {
                    c.x[i][s] -= a.x[i][k] * c.x[k][s] / a.x[i][i];
                }
            }
        }
        return c;
    }

    public String toString(){
        String texto="\n";
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[0].length ; j++){
                texto+="\t "+x[i][j];
            }
            texto+="\n";
        }
        texto+="\n";
        return texto;
    }

}
