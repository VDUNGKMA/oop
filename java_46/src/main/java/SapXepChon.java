
public class SapXepChon implements Sapxep_Interface {

    @Override
    public void sapxeptang(double arr[]) {
        int n = arr.length;
        int i, j, min_idx;
        // Di chuyển ranh giới của mảng đã sắp xếp và chưa sắp xếp
        for (i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa sắp xếp
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

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
