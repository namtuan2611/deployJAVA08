package com.example.REDIS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSanPham")
    private Integer maSanPham;

    @Column(name = "TenSanPham", nullable = false, length = 200)
    private String tenSanPham;

    @Column(name = "DanhMuc", length = 100)
    private String danhMuc;

    @Column(name = "NhaCungCap", length = 200)
    private String nhaCungCap;

    @Column(name = "Gia", nullable = false, precision = 18, scale = 2)
    private BigDecimal gia;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "MoTa", length = 1000)
    private String moTa;

    @Column(name = "HinhAnh", length = 500)
    private String hinhAnh;

    @Column(name = "TrangThai")
    private Boolean trangThai;

    @Column(name = "NgayTao")
    private LocalDateTime ngayTao;

    @Column(name = "NgayCapNhat")
    private LocalDateTime ngayCapNhat;
}
