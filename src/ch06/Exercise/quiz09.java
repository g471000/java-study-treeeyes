package ch06.Exercise;

class Marine {
    int x = 0, y = 0;
    int hp = 60;

    // all marine instance should have equal weapon and armor
    static int weapon = 6;
    static int armor = 0;

    // When the player upgrade option, all marines get upgraded weapon
    static void weaponUp() {
        weapon++;
    }

    // Same for the armor, so it should be static.
    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}