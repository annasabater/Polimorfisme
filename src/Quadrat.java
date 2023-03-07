public class Quadrat extends Rectangle {
        public Quadrat(double l1, double l2) {
            super(l1, l2);
        }
        public String toString() {
            return "Quadrat amb costat: "+this.getL1()+"i area: "+super.area();
        }
}
