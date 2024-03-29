public class Case {
    protected boolean contientUneBombe;
    protected boolean estDecouverte;
    protected boolean estMarquee;

    public Case() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void reset() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void poseBombe() {
        this.contientUneBombe = true;
    }

    public boolean contientUneBombe() {
        return this.contientUneBombe;
    }

    public boolean estDecouverte() {
        return this.estDecouverte;
    }

    public boolean estMarquee() {
        return this.estMarquee;
    }

    public boolean reveler() {
        if (!this.estDecouverte) {
            this.estMarquee = false;
            this.estDecouverte = true;
            return true;
        }
        return false;
    }

    public void marquer() {
        this.estMarquee = true;
    }
}
