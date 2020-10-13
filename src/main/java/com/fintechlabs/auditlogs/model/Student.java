package com.fintechlabs.auditlogs.model;

import com.fintechlabs.auditlogs.audit.AuditAware;
import com.fintechlabs.auditlogs.audit.AuditLogListener;
import com.fintechlabs.auditlogs.audit.Auditable;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@EntityListeners(value = {AuditLogListener.class})
public class Student extends Auditable<String> implements Serializable, AuditAware  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

}
