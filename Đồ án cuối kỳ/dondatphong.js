document.addEventListener('DOMContentLoaded', () => {
    // Lấy thông tin đặt phòng từ localStorage
    const bookingInfo = JSON.parse(localStorage.getItem('bookingInfo'));
    if (!bookingInfo) {
        alert('Không tìm thấy thông tin đặt phòng.');
        return;
    }

    // Tạo mã đặt phòng giả (bạn có thể thay bằng logic khác)
    const bookingCode = 'HB-2024-' + Math.floor(Math.random() * 900000 + 100000);
    document.getElementById('bookingCode').value = bookingCode;

    // Hiển thị thông tin khách sạn
    document.getElementById('hotelInfo').innerHTML = `
        <strong>${bookingInfo.hotelName}</strong><br/>
        ${bookingInfo.roomType}<br/>
        ${bookingInfo.location}
    `;

    // Hiển thị thời gian lưu trú
    document.getElementById('stayInfo').innerHTML = `
        Nhận phòng: ${bookingInfo.checkIn}<br/>
        Trả phòng: ${bookingInfo.checkOut}<br/>
        ${bookingInfo.nights} đêm
    `;

    // Thông tin khách
    document.getElementById('guestInfo').textContent = bookingInfo.guests;

    // Tính toán tổng chi phí (cộng thuế vào giá phòng)
    const subtotal = bookingInfo.subtotal; // Giá phòng trước thuế (subtotal)
    const tax = bookingInfo.tax; // Thuế
    const totalCost = subtotal + tax; // Tổng chi phí (bao gồm thuế)

    // Cập nhật tổng chi phí vào phần tử #total (cập nhật động)
    document.getElementById('totalPrice').textContent = totalCost.toLocaleString('vi-VN') + ' ₫'; // Cập nhật tổng chi phí

    // Cập nhật giá phòng và thuế
    document.getElementById('price').textContent = subtotal.toLocaleString('vi-VN') + ' ₫';
    document.getElementById('tax').textContent = tax.toLocaleString('vi-VN') + ' ₫';
});

// Khi bấm "Xác nhận đặt phòng"
document.getElementById('bookingForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Ngừng hành động mặc định của form

    // Bạn có thể lấy dữ liệu form và lưu hoặc xử lý thêm nếu cần
    const customerInfo = {
        lastName: document.getElementById('lastname').value,
        firstName: document.getElementById('firstname').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        specialRequest: document.getElementById('specialRequest').value
    };

    // Lưu thông tin khách hàng (có thể lưu vào server hoặc localStorage tùy ý)
    console.log("Thông tin khách hàng:", customerInfo);

    // Chuyển hướng đến trang thành công
    window.location.href = 'datphongthanhcong.html'; // Hoặc trang khác mà bạn muốn
});
