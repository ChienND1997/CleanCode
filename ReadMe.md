### Source code khóa học clean code
** Source mới nhất được update tại branch feture/dev** :smile::smile:
### Phần mềm tính lương phiên bản 1.0
:smile::smile:
### <h1>Cấu trúc dự án:</h1>

>src\
>└─ main\
>  &nbsp;├─ java.vn.techmaster.payroll\
>  &nbsp;│	 &nbsp;&nbsp;├─ controller\
>  &nbsp;│   &nbsp;&nbsp;├─ model\
>  &nbsp;│	 &nbsp;&nbsp;├─	repo\
>  &nbsp;│	 &nbsp;&nbsp;├─ services\
>  &nbsp;│   &nbsp;&nbsp;├─ util\
>  └─ resources

##Desciption\
>controller : xử lý request từ client và trả về kết quả\
>services: Thực hiện các nghiệp vụ và xử lý logic\
>repo: Chịu trách nhiệm giao tiếp với các DB, thiết bị lưu trữ, xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu( trường hợp có DB)\
>model: Khởi tạo entites để lấy các thông tin từ DB, json, csv v.v.v\
>util: Lưu các giá trị cố định\
>resources: lưu trữ tài nguyên dự án

## Tiến độ
1. Đọc vào danh sách nhân viên dạng file CSV gồm các trường: 
  - name: họtên
  - dob: ngày sinh
  - role: chức vụ[director,manager,sales,engineer,staff,worker]
  - startdate: ngày bắt đầu làm việc ở công ty
  - startsal: mức lương khởi điểm

===> Done
2. In ra màn hình tính đến ngày hôm nay:
  - Tuổi hiện tại của nhân viên
  - Số năm và tháng làm việc. Làm tròn xuống, 3 năm, 2 tháng 15 ngày --> 3 năm, 2 tháng
 ===> Done
3. Công thức tăng lương theo thâm niên phiên bản 1.0:
  - Bất kỳ nhân viên nào không quan tâm đến chức vụ, cứ làm đủ 12 tháng là tăng một bậc lương 6% so với mức lương cũ. Cách tính này không cần đến đầu năm mới điều chỉnh.
  - Hãy tính lương tại thời điểm hiện tại của nhân viên
===> Done
## Phần mềm tính lương phiên bản 2.0

===> To do
1. Hỗ trợ đọc vào file Excel
2. Chỉ số tăng lương đối với chức vụ là khác nhau
3. Quy luật tính lương còn bao gồm cả thưởng theo doanh số đối với [manager,sales], over time đối với [engineer,staff,worker]  ngày càng phức tạp.
Hãy làm sao thiết kế hệ thống để đáp ứng những thay đổi ngày một nhiều