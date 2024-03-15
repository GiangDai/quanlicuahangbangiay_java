-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 14, 2021 lúc 01:26 PM
-- Phiên bản máy phục vụ: 10.4.18-MariaDB
-- Phiên bản PHP: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlybangiay1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cthoadon`
--

CREATE TABLE `cthoadon` (
  `MaHD` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `cthoadon`
--

INSERT INTO `cthoadon` (`MaHD`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
(18, 114, 2, 159000, 318000),
(18, 122, 3, 249000, 747000),
(18, 124, 6, 19000, 114000),
(18, 130, 2, 19000, 38000),
(18, 132, 2, 25000, 50000),
(19, 115, 2, 119000, 238000),
(19, 120, 1, 239000, 239000),
(19, 128, 4, 19000, 76000),
(19, 131, 5, 10000, 50000),
(20, 118, 1, 129000, 129000),
(20, 120, 2, 239000, 478000),
(20, 129, 5, 19000, 38000),
(20, 130, 5, 19000, 95000),
(20, 131, 10, 10000, 100000),
(21, 112, 3, 129000, 387000),
(21, 117, 2, 149000, 298000),
(21, 126, 10, 19000, 190000),
(21, 127, 3, 29000, 87000),
(21, 128, 15, 19000, 285000),
(21, 131, 6, 10000, 60000),
(22, 114, 5, 159000, 795000),
(22, 127, 10, 29000, 290000),
(22, 129, 6, 19000, 95000),
(22, 132, 3, 25000, 75000),
(23, 112, 3, 129000, 387000),
(23, 113, 1, 119000, 119000),
(23, 118, 1, 129000, 129000),
(23, 128, 6, 19000, 114000),
(23, 131, 5, 10000, 50000),
(23, 132, 2, 25000, 25000),
(24, 115, 1, 119000, 119000),
(24, 116, 1, 130000, 130000),
(24, 119, 1, 239000, 239000),
(24, 126, 6, 19000, 114000),
(24, 127, 3, 29000, 87000),
(24, 131, 7, 10000, 70000),
(24, 132, 4, 25000, 100000),
(25, 118, 1, 129000, 129000),
(25, 121, 1, 229000, 229000),
(25, 130, 4, 19000, 76000),
(25, 131, 5, 10000, 50000),
(25, 132, 3, 25000, 75000),
(26, 111, 3, 169000, 507000),
(26, 120, 3, 239000, 717000),
(26, 122, 2, 249000, 498000),
(26, 127, 4, 29000, 116000),
(27, 113, 1, 119000, 119000),
(27, 119, 1, 239000, 239000),
(27, 123, 1, 269000, 269000),
(27, 126, 1, 19000, 19000),
(27, 131, 1, 10000, 10000),
(28, 113, 10, 119000, 1190000),
(28, 116, 4, 130000, 520000),
(28, 119, 3, 239000, 717000),
(28, 132, 5, 25000, 125000),
(29, 114, 4, 159000, 636000),
(29, 115, 1, 119000, 119000),
(29, 116, 1, 130000, 130000),
(29, 131, 2, 10000, 20000),
(30, 116, 1, 130000, 130000),
(30, 117, 7, 149000, 1043000),
(30, 123, 10, 269000, 2690000),
(30, 125, 1, 29000, 29000),
(30, 127, 2, 29000, 29000),
(31, 111, 1, 169000, 169000),
(31, 115, 6, 119000, 595000),
(31, 117, 1, 149000, 149000),
(31, 118, 1, 129000, 129000),
(31, 130, 4, 19000, 76000),
(32, 120, 5, 239000, 1195000),
(32, 121, 4, 229000, 916000),
(33, 116, 1, 130000, 130000),
(33, 119, 30, 239000, 7170000),
(35, 113, 1, 119000, 119000),
(35, 117, 1, 149000, 149000),
(35, 131, 8, 10000, 70000),
(37, 116, 1, 130000, 130000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ctphieunhap`
--

CREATE TABLE `ctphieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaSP` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `ThanhTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `ctphieunhap`
--

INSERT INTO `ctphieunhap` (`MaPN`, `MaSP`, `SoLuong`, `DonGia`, `ThanhTien`) VALUES
(4, 128, 100, 10000, 1000000),
(4, 129, 3, 9000, 27000),
(5, 124, 6, 10000, 60000),
(5, 125, 3, 15000, 45000),
(5, 126, 7, 10000, 70000),
(5, 127, 2, 15000, 30000),
(5, 130, 3, 9000, 27000),
(5, 131, 9, 4000, 36000),
(7, 126, 9, 10000, 90000),
(8, 124, 30, 10000, 300000),
(8, 126, 50, 10000, 500000),
(8, 129, 30, 9000, 270000),
(9, 135, 100, 10000, 1000000),
(10, 136, 200, 23000, 4600000),
(10, 137, 80, 84500, 6760000);


-- ------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHD` int(11) NOT NULL,
  `MaKH` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL,
  `GhiChu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MaHD`, `MaKH`, `NgayLap`, `TongTien`, `GhiChu`) VALUES
(18, 4,  '2023-01-18', 1013600, 'Đã thanh toán'),
(19, 1,  '2023-01-20', 482400, 'Đã thanh toán'),
(20, 2,  '2023-01-28', 840000, 'Đã thanh toán'),
(21, 3,  '2024-02-07', 1045600, 'Đã thanh toán'),
(22, 1,  '2023-02-14', 1004000, 'Đã thanh toán'),
(23, 7, '2024-02-16', 576800, 'Đã thanh toán'),
(24, 7,  '2022-03-08', 601300, 'Đã thanh toán'),
(25, 2,  '2023-03-09', 391300, 'Đã thanh toán'),
(26, 8,  '2023-03-12', 1286600, 'Đã thanh toán'),
(27, 8,  '2023-03-24', 590400, 'Đã thanh toán'),
(28, 7,  '2023-02-04', 2041600, 'Đã thanh toán'),
(29, 9,  '2023-04-10', 633500, 'Đã thanh toán'),
(30, 10,  '2023-04-15', 3136800, 'Đã thanh toán'),
(31, 11,  '2023-05-02', 782600, 'Đã thanh toán'),
(32, 11,  '2023-05-03', 1477700, 'Đã thanh toán'),
(33, 9,  '2023-05-06', 5110000, 'Đã thanh toán'),
(35, 3,  '2023-05-08', 304200, 'Đã thanh toán'),
(37, 2,  '2023-05-08', 117000, 'Đã thanh toán');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` int(11) NOT NULL,
  `Ho` varchar(255) NOT NULL,
  `Ten` varchar(255) NOT NULL,
  `GioiTinh` varchar(3) NOT NULL,
  `TinhTrang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MaKH`, `Ho`, `Ten`, `GioiTinh`,`TinhTrang`) VALUES
(1, 'Nguyễn Văn', 'An', 'Nam',1),
(2, 'Trần Ngọc', 'Bình', 'Nữ',1),
(3, 'Lê Thị', 'Giải', 'Nữ',1),
(4, 'Hà Thanh', 'Thoát', 'Nam',1),
(7, 'Trịnh Thị', 'Yên', 'Nữ',1),
(8, 'Trương Đình', 'Vui', 'Nam',1),
(9, 'Lại Thị Ngọc', 'Miền', 'Nữ',1),
(10, 'Trần Quang', 'Cực', 'Nam',1),
(11, 'Nguyễn Ngọc', 'Lạc', 'Nam',1),
(12, 'Phạm Thị', 'Thuận', 'Nữ', 1),
(13, 'Hoàng Thị', 'Linh', 'Nữ', 1),
(14, 'Vũ Thị', 'Hương', 'Nữ', 1),
(15, 'Đỗ Thị', 'Lan', 'Nữ', 1),
(16, 'Bùi Thị', 'Hằng', 'Nữ', 1),
(17, 'Mai Thị', 'Lệ', 'Nữ', 1),
(18, 'Đặng Thị', 'Ngọc', 'Nữ', 1),
(19, 'Võ Thị', 'Hoa', 'Nữ', 1),
(20, 'Nguyễn Thị', 'Trang', 'Nữ', 1),
(21, 'Trần Thị', 'Hồng', 'Nữ', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `size`
--

CREATE TABLE `size` (
  `MaSize` int(11) NOT NULL,
  `TenSize` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `size`
--

INSERT INTO `size` (`MaSize`, `TenSize`) VALUES
(1, '38'),
(2, '39'),
(3, '40'),
(4, '41'),
(5, '42'),
(6, '43');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNCC` int(11) NOT NULL,
  `TenNCC` varchar(255) NOT NULL,
  `DiaChi` varchar(255) NOT NULL,
  `DienThoai` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`, `DiaChi`, `DienThoai`) VALUES
(1, 'Công ty Cổ phần giày Việt', '273 An Dương Vương, phường 3, quận 5, Hà Nội', '0396527908'),
(2, 'Công ty giày Hồng Thạnh', 'Võ Văn Kiệt, P.Cô Giang, Đà Nẵng', '0902669733'),
(3, 'Công ty giày da Kim Thành', ' P.25, Q. Bình Thạnh,Hà Nội', '0397682193');

-- --------------------------------------------------------

--

-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPN` int(11) NOT NULL,
  `MaNCC` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `TongTien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`MaPN`, `MaNCC`, `NgayLap`, `TongTien`) VALUES
(4, 1, '2023-04-19', 1027000),
(5, 2, '2023-04-23', 268000),
(7, 2, '2023-04-26', 90000),
(8, 3, '2023-05-02', 1070000),
(9, 3, '2023-05-04', 1000000),
(10, 1, '2021-05-07', 11360000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MaSP` int(11) NOT NULL,
  `TenSP` varchar(255) NOT NULL,
  `MaSize` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonViTinh` varchar(255) NOT NULL,
  `DonGia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bang San Pham';

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MaSP`, `TenSP`, `MaSize`, `SoLuong`, `DonViTinh`, `DonGia`) VALUES
(111, 'Giày Sneakers Nam XYZ', 1, 20, 'vnđ', 500000),
(112, 'Giày Thể Thao Nữ ABC', 3, 15, 'vnđ', 450000),
(113, 'Giày Bít Mũi Nam QWE', 2, 10, 'vnđ', 600000),
(114, 'Giày Sandal Nữ DEF', 3, 25, 'vnđ', 350000),
(115, 'Giày Cao Gót Nữ GHI', 6, 18, 'vnđ', 550000),
(116, 'Giày Sneakers Nữ LMN', 3, 22, 'vnđ', 480000),
(117, 'Giày Thể Thao Nam OPQ', 4, 17, 'vnđ', 520000),
(118, 'Giày Bít Mũi Nữ RST', 3, 12, 'vnđ', 590000),
(140, 'Giày Sandal Nam UVW', 2, 20, 'vnđ', 380000),
(141, 'Giày Sneakers Nữ XYZ', 3, 15, 'vnđ', 470000),
(142, 'Giày Thể Thao Nam ABC', 3, 18, 'vnđ', 510000),
(143, 'Giày Búp Bê Nữ XYZ', 3, 40, 'vnđ', 430000),
(144, 'Giày Sneakers Nữ PQR', 3, 19, 'vnđ', 490000),
(145, 'Giày Thể Thao Nữ GHI', 6, 16, 'vnđ', 520000),
(146, 'Giày Bít Mũi Nam UVW', 2, 23, 'vnđ', 600000),
(147, 'Giày Sandal Nữ ABC', 3, 21, 'vnđ', 370000),
(148, 'Giày Sneakers Nam DEF', 4, 13, 'vnđ', 530000),
(149, 'Giày Cao Gót Nữ LMN', 3, 18, 'vnđ', 560000),
(150, 'Giày Búp Bê Nữ OPQ', 2, 25, 'vnđ', 420000),
(151, 'Giày Thể Thao Nam RST', 2, 20, 'vnđ', 510000),
(152, 'Giày Bít Mũi Nam UVW', 2, 16, 'vnđ', 590000),
(153, 'Giày Sneakers Nữ ABC', 1, 14, 'vnđ', 480000),
(154, 'Giày Sandal Nam PQR', 5, 22, 'vnđ', 390000),
(155, 'Giày Cao Gót Nữ XYZ', 6, 17, 'vnđ', 550000),
(156, 'Giày Búp Bê Nữ RST', 5, 20, 'vnđ', 430000),
(157, 'Giày Thể Thao Nam DEF', 4, 15, 'vnđ', 520000),
(158, 'Giày Bít Mũi Nữ PQR', 6, 19, 'vnđ', 590000),
(159, 'Giày Sneakers Nữ UVW', 1, 21, 'vnđ', 480000),
(160, 'Giày Sandal Nữ GHI', 3, 16, 'vnđ', 360000),
(161, 'Giày Cao Gót Nam ABC', 2, 14, 'vnđ', 540000),
(162, 'Giày Búp Bê Nam LMN', 3, 18, 'vnđ', 520000);


-- --------------------------------------------------------

--

-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD PRIMARY KEY (`MaHD`,`MaSP`),
  ADD KEY `cthoadon_ibfk_1` (`MaHD`);

--
-- Chỉ mục cho bảng `ctphieunhap`
--
ALTER TABLE `ctphieunhap`
  ADD PRIMARY KEY (`MaPN`,`MaSP`);

--
-- Chỉ mục cho bảng `giamgia`
--

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHD`),
  ADD KEY `hoadon_ibfk_2` (`MaKH`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Chỉ mục cho bảng `size`
--
ALTER TABLE `size`
  ADD PRIMARY KEY (`MaSize`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNCC`);

--

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `phieunhap_ibfk_1` (`MaNCC`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MaSP`),
  ADD KEY `sanpham_ibfk_1` (`MaSize`);

--

-- AUTO_INCREMENT cho các bảng đã đổ
--

--

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `MaKH` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT cho bảng `size`
--
ALTER TABLE `size`
  MODIFY `MaSize` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `MaNCC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MaSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `cthoadon`
--
ALTER TABLE `cthoadon`
  ADD CONSTRAINT `cthoadon_ibfk_1` FOREIGN KEY (`MaHD`) REFERENCES `hoadon` (`MaHD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `ctphieunhap`
--
ALTER TABLE `ctphieunhap`
  ADD CONSTRAINT `ctphieunhap_ibfk_2` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`MaSize`) REFERENCES `size` (`MaSize`) ON DELETE CASCADE ON UPDATE CASCADE;

--


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
