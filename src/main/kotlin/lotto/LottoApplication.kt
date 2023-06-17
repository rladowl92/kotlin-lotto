package lotto

import lotto.domain.LottoTicket
import lotto.domain.LottoTickets
import lotto.util.RandomNumbers
import lotto.view.InputView
import lotto.view.OutputView

object LottoApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        // 구매 금액 입력
        val money = InputView.inputMoney()
        val lottoTickets = LottoTickets(money, RandomNumbers)

        // 구매 티켓 출력
        OutputView.printPurchase(lottoTickets)

        // 당첨번호 입력
        val inputWinNumbers: List<Int> = InputView.inputWinNumbers()
        val winNumbers = LottoTicket(inputWinNumbers)

        // 당첨 통계
        OutputView.printWinStats(lottoTickets.getWinStats(winNumbers))
    }
}