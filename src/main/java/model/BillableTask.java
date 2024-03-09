package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.scheduling.config.Task;
@Entity
@Table(name = "billable_task")
@Getter
@Setter
@SuperBuilder
public class BillableTask extends Task {
    private double hourlyRate;
}
