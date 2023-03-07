public abstract class Figura implements Comparable<Figura> {
    public abstract double area();
    public int compareTo(Figura f){
        return (int)(this.area()-f.area());//Retorna cero sin son iguales, y 1 en caso que sea mayor.
    }
}
