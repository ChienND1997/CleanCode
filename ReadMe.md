# Nguyễn Đăng Chiến
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. **5 mục tiêu chính của Clean Code là:**
   - Mục tiêu 1:  Làm cho code trở nên trang nhã, hiệu quả, dễ đọc, đơn giản, không trùng lặp và được viết tốt.
   - Mục tiêu 2:  Làm tăng giá trị cho công việc bằng code của mình
   - Mục tiêu 3:  Clean code mang lại sự dễ hiểu và chất lượng khi chúng ta đọc code.
   - Mục tiêu 4:  Điều cần thiết là code của bạn phải sạch sẽ và dễ đọc để mọi người có thể tìm thấy và dễ dàng hiểu.
   - Mục tiêu 5:  luôn tìm ra nguyên nhân gốc rễ. luôn luôn tìm kiếm nguyên nhân gốc rễ của một vấn đề
2. **Đáp án của tôi là team C bởi vì:**
   - Lý do 1: Tiến độ là yếu tố quan trọng quyết định sự thành công của dự án. Deadline luôn phải được ưu tiên.
   - Lý do 2: Nếu code một cách tự do ở SPIN 1 để đáp ứng dealine nhưng sẽ phải tốn nhiều thời gian và nhân lực cho những SPIN sau để khắc phục những đoạn `code smell` là một điều tệ.
   - Lý do 3: Thay đổi require là một điều thường gặp ở khách hàng. Clean code sẽ giúp chúng ta tốn ít thời gian và nhân lực hơn cho việc `change require`
   
3. **Những nội dung cần trả lời**
```
Bạn là một team lead, khi bạn giới thiệu các quy tắc Clean Code cho các đồng đội trẻ. Có một số bạn cho rằng Clean Code chỉ làm phức tạp thêm vấn đề, và chậm lại hiệu suất làm việc của nhóm. Bạn sẽ trả lời họ thế nào?
```
   
   - Code chạy được là một điều tốt nhưng chỉ chạy được thôi thì chưa đủ, Clean code sẽ giúp chúng ta dễ bảo trì, dễ dàng mở rộng.
   - Đưa ra vòng đời trong phần mềm để member hiểu tại sao lại cần sử dụng clean code để đáp ứng đủ và tốt những yêu cầu trong vòng đời đó. Không chỉ mỗi chạy thành công là xong.

4. **Đề xuất của Vân là phù hợp với quy ước trong CleanCode?**
```
Đề xuất của Vân float raise là thuộc tính trong class Salary rồi.

int calculateSalaryAfterYears(int initialSalary, int NthYear);
```
5.Hãy lập trình mô hình hoá nghiệp vụ sau đây. Cụ thể là hãy bổ xung các method để hoàn thiện logic. Quan trọng hãy tuân thủ quy tắc Clean Code.

https://github.com/ChienND1997/CleanCode/tree/feature/dev/Phan1/post-management
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
https://github.com/ChienND1997/CleanCode/tree/feature/dev/Phan2/GraphicEditor

### 2. Composition over Inheritance và DI

## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
https://github.com/ChienND1997/CleanCode/tree/feature/dev/Phan3
## Phần 4: Thiết kế RESTful API
https://github.com/ChienND1997/CleanCode/tree/feature/dev/Phan4/registration-user
## Phần 5: Lập trình Restful API
https://github.com/ChienND1997/CleanCode/tree/feature/dev/Phan5/spring-trategy-pattern
## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
    - C. Đã được thiết kế và cài đặt ở mức chi tiết.
2. Các OOP Design Pattern được chia làm mấy nhóm?
   - B.3
3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   - A. Quan tâm đến cách các lớp và các đối tượng được tổ chức để trở thành một cấu trúc lớn hơn.
   - B. Cung cấp các cơ chế khởi tạo đối tượng khác nhau, làm tăng tính linh hoạt và tái sử dụng code.
   - D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
   - A. Builder
5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   - A. Có
6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   - B. Immutable
7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   - B. Có
8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   - C. Cả A và B
9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
   - B. Template Method
10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?.
   - A. Strategy
11. REST là gì?
   - B. Kiểu kiến trúc phần mềm
12. Đâu không phải là đặc điểm của một hệ thống RESTful?
   - C. Server lưu trữ session và history của client.
13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
   - B. POST
14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
   - B. POST
15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
   - D. Cả 3 đáp án trên
16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
   - A. Service
17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
   - D. 4
18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
   - A. Sử dụng @ControllerAdvice và @ExceptionHandler
19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
   - B. DEBUG
20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
   - B. WARN
21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
   - A. Có
22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
   - B. Cần lưu một danh sách các phần tử dưới dạng phân cách nhau bởi ký tự đặc biệt và không cần truy vấn từng phần tử.
23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
   - C. Tạo một bảng riêng để lưu các tag của article.
24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
   - A. 1
25. Tree model nào không dễ để query child node ngay dưới?
   - A. Adjacency list
