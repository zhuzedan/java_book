package toll_7_5;

public class CinemaPriceCalculator implements PriceCalculator {
    private String movieType;

    public CinemaPriceCalculator(String movieType) {
        this.movieType = movieType;
    }

    @Override
    public double calculatePrice(double duration) {
        // 这里假设duration不是必要的参数，因为我们按照电影类型定价
        switch (movieType) {
            case "2D":
                return 19.9;
            case "3D":
                return 39.9;
            case "IMAX":
                return 59.9;
            default:
                return 0;
        }
    }
}
