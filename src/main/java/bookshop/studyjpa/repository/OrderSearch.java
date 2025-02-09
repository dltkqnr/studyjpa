package bookshop.studyjpa.repository;

import bookshop.studyjpa.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName; // 회원 이름
    private OrderStatus orderStatus; // ORDER, CANCEL
}
