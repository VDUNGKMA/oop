
public class phanmemmaytinh implements Maytinhbotui_interface, Sapxep_Interface {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }

    @Override
    public void sapxeptang(double arr[]) {
        int i, j, n = arr.length;
        double key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            /* Di chuyển các phần tử có giá trị lớn hơn giá trị 
       key về sau một vị trí so với vị trí ban đầu
       của nó */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    @Override
    public void sapxepgiam(double arr[]) {
        int n = arr.length;
        int i, j, min_idx;
        // Di chuyển ranh giới của mảng đã sắp xếp và chưa sắp xếp
        for (i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }

}
