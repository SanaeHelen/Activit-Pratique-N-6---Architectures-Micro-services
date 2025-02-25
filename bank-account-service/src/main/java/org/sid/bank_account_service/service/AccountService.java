package org.sid.bank_account_service.service;

import org.sid.bank_account_service.dto.BankAccountRequestDTO;
import org.sid.bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccout(BankAccountRequestDTO bankAccountDTO);

     BankAccountResponseDTO updateAccout(String id, BankAccountRequestDTO bankAccountDTO);
}
