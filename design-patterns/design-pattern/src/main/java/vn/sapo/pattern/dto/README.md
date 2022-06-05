# Data Transfer Object

- https://java-design-patterns.com/patterns/data-transfer-object/
- https://github.com/iluwatar/java-design-patterns/tree/master/data-transfer-object
- https://gpcoder.com/5156-huong-dan-java-design-pattern-transfer-object/

Transfer Object/ Data Transfer Object Pattern là một dạng Architectural Design Pattern, được sử dụng khi chúng ta muốn truyền dữ liệu qua lại giữa các tầng trong ứng dụng, giữa Client – Server. Data Transfer Object (DTO) còn được gọi là Value Object (VO).

Với các ứng dụng phức tạp hơn, chúng ta không muốn hiển thị toàn bộ Domain Model cho Client, do đó, việc ánh xạ từ các Domain Model sang DTO là cần thiết.

Lợi ích:\
Tách biệt logic một cách rõ ràng\
Giảm kết dính giữa các tầng trong ứng dụng: Client chỉ thao tác với Transfer Object, nên nó không bị ảnh hưởng khi Domain Model thay đổi.\
Bao đóng các đối số : một phương thức có nhiều đối số, chúng ta có thể bao đóng chúng trong một Transfer Object. Giúp chúng ta dễ dàng mở rộng, thêm/ bớt đối số.\
Nhận nhiều dữ liệu trả về : trong Java, một phương thức chỉ có thể trả về một giá trị, để có thể nhận được nhiều giá trị, chúng ta có thể bao đóng chúng trong một Transfer Object.\
Tăng bảo mật ứng dụng : tùy vào người dùng khác nhau có thể xem được một số dữ liệu nhất định. Chúng ta có thể tạo nhiều Transfer Object khác nhau cho từng loại người dùng thay vì trả về một Domain Object một cách trực tiếp. Trường hợp rõ ràng nhất là User Model, domain object này chứa thông tin cả email, password, số tài khoản ngân hàng. Chúng ta có thể tạo một Transfer Object đơn giản chỉ chứa thông tin họ tên, ngày sinh. Không cần thiết phải trả tất cả dữ liệu Domain Model về Client.
