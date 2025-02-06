public record AnimalData(String breed, int age) {
    int afterNYears(int n) {
        return age*n;
    }
}
