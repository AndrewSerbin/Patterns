package behavioral.memento;

class Main {

    public static void main(String[] args) {
	Game game = new Game();
	game.set("Level 1", 30000);
	System.out.println(game);

	File file = new File();
	file.setSave(game.save());

	game.set("Level 2", 55000);
	System.out.println(game);

	game.load(file.getSave());
	System.out.println(game);
    }
}
