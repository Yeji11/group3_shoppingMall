package org.example.shoppingmall.dto.payment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PaymentInfoDto {
    // 주문 정보
    private Integer orderId;
    private String customerId;
    private String orderStatus;
    private Integer totalOrderAmount;
    private Integer totalQuantity;
    private Integer totalTypeCnt;
    private List<PaymentOrderDetailDto> orderDetailList;

    // 결제 정보
    private String paymentMethod;
    private Integer cardType;
    private Integer cardInstallment;
    private Integer cardNumber;
    private String cashBankName;
    private Integer cashReceiptType;
    private Integer cashReceiptNumber;
}
