public class ComplexNumber {
    private double realPart; // 定义属性表示实部
    private double imagePart; // 定义属性表示虚部

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double imagePart) {
        this.realPart = realPart;
        this.imagePart = imagePart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagePart() {
        return imagePart;
    }

    public void setImagePart(double imagePart) {
        this.imagePart = imagePart;
    }

    public ComplexNumber add(ComplexNumber another) {
        double realPartResult = realPart + another.realPart;
        double imagePartResult = imagePart + another.imagePart;
        return new ComplexNumber(realPartResult, imagePartResult);
    }

    public ComplexNumber sub(ComplexNumber another) {
        double realPartResult = realPart - another.realPart;
        double imagePartResult = imagePart - another.imagePart;
        return new ComplexNumber(realPartResult, imagePartResult);
    }

    public ComplexNumber muti(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = realPart * another.realPart - imagePart * another.imagePart;
        result.imagePart = realPart * another.imagePart + imagePart * another.realPart;
        return result;
    }

    public ComplexNumber div(ComplexNumber another) {
        ComplexNumber result = new ComplexNumber();
        result.realPart = (realPart * another.realPart + imagePart * another.imagePart) / (Math.pow(another.realPart, 2) + Math.pow(another.imagePart, 2));
        result.imagePart = (imagePart * another.realPart - realPart * another.imagePart) / (Math.pow(another.realPart, 2) + Math.pow(another.imagePart, 2));
        return result;
    }

    public String toString() {
        if (realPart == 0 && imagePart == 0) {
            return "0";
        } else if (imagePart == 0) {
            return realPart + "";
        } else if (realPart == 0) {
            return imagePart + "i";
        } else if (imagePart > 0) {
            return realPart + "+" + imagePart + "i";
        } else {
            return realPart + "" + imagePart + "i";
        }
    }
}
