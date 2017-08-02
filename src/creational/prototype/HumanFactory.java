package creational.prototype;

class HumanFactory {

    Human prototype;

    public HumanFactory(Human human) {
	setPrototype(human);
    }

    public void setPrototype(Human prototype) {
	this.prototype = prototype;
    }

    Human makeCopy() {
	return (Human) prototype.copy();
    }
}
