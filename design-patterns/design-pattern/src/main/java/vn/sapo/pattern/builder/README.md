# Builder Pattern

- https://java-design-patterns.com/patterns/builder/
- https://github.com/iluwatar/java-design-patterns/tree/master/builder
- https://gpcoder.com/4434-huong-dan-java-design-pattern-builder/
- https://sourcemaking.com/design_patterns/builder
- https://refactoring.guru/design-patterns/builder
- https://www.journaldev.com/1425/builder-design-pattern-in-java

Builder pattern là một trong những Creational pattern. Builder pattern là mẫu thiết kế đối tượng được tạo ra để xây dựng một đôi tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và sử dụng tiếp cận từng bước, việc xây dựng các đối tượng đôc lập với các đối tượng khác.

Builder Pattern được xây dựng để khắc phục một số nhược điểm của Factory Pattern và Abstract Factory Pattern khi mà Object có nhiều thuộc tính.

Có ba vấn đề chính với  Factory Pattern và Abstract Factory Pattern khi Object có nhiều thuộc tính:

Quá nhiều tham số phải truyền vào từ phía client tới Factory Class.\
Một số tham số có thể là tùy chọn nhưng trong Factory Pattern, chúng ta phải gửi tất cả tham số, với tham số tùy chọn nếu không nhập gì thì sẽ truyền là null.\
Nếu một Object có quá nhiều thuộc tính thì việc tạo sẽ phức tạp.

Lợi ích:\
Hỗ trợ, loại bớt việc phải viết nhiều constructor.\
Code dễ đọc, dễ bảo trì hơn khi số lượng thuộc tính (propery) bắt buộc để tạo một object từ 4 hoặc 5 propery.\
Giảm bớt số lượng constructor, không cần truyền giá trị null cho các tham số không sử dụng.\
Ít bị lỗi do việc gán sai tham số khi mà có nhiều tham số trong constructor: bởi vì người dùng đã biết được chính xác giá trị gì khi gọi phương thức tương ứng.\
Đối tượng được xây dựng an toàn hơn: bởi vì nó đã được tạo hoàn chỉnh trước khi sử dụng.\
Cung cấp cho bạn kiểm soát tốt hơn quá trình xây dựng: chúng ta có thể thêm xử lý kiểm tra ràng buộc trước khi đối tượng được trả về người dùng.\
Có thể tạo đối tượng immutable.
