# US G006

## 1. Context

*This task is being updated in this Sprint.*

## 2. Requirements

*In this section you should present the functionality that is being developed, how do you understand it, as well as
possible correlations to other requirements (i.e., dependencies). You should also add acceptance criteria.*

**US G006** As Project Manager, I want the team to elaborate a Domain Model using DDD.

### **Acceptance Criteria from the Client:**

*Q6 – For each Customer, there only exists one "representative" that accesses to an account (i.e., Customer App)?*

*A6 - Yes, it seems enough.*

*Q11 - The statement does not explicitly state the information to collect for Customers, does it? What information is
needed? And what about company employees?*

*A11 - The Product Owner reconsidered and decided that the short username is dispensable since only the email and
password should be used for user authentication.*

*Q12 Bernardo – Qual a distinção entre especificação de requisitos e de entrevistas?*

*A12 O “estilo” das perguntas e respostas é similar, mas nos requisitos o objetivo é avaliar o candidato e ver se tem os mínimos ou não, portanto o resultado será sim ou não. Nas entrevistas a ideia é classificar/pontuar cada resposta de forma a no final ter pontuações diferentes para os candidatos e assim ajudar a fazer o seu ranking.*

*Q18 - In US 1011, how does the Customer Manager select the template to use for interviews?*

*A18 - It is assumed that the templates, when registered in the system (those "plugins"), are identified with a name or
description. For example, "Checkout Cashier Supermarket Interview Template" or "Junior Backend Java Programmer Interview
Template." In US 1011, the Customer Manager is supposed to select a template from a possible list of templates.*

*Q21 - Regarding the Companies, and in connection with Q11, what did the address mentioned in the response mean?*

*A21 - I was referring to the company's postal address (not the email address).*

*Q22 - Regarding the Job Opening (section 2.2.2), the job reference states that it should be generated by the system
from
a customer code. What is this customer code and are there any rules for its creation?*

*A22 - I would say that any customer must have an identifying (unique) code, which could be a sort of abbreviation of
their name. It should have a limited number of characters. For example, for the customer Instituto Superior de
Engenharia do Porto, the customer code could be ISEP, and no other customer could have this customer code. A reasonable
limit would perhaps be 8 to 10 characters. Let's define it as 10. This code is manually entered when creating the
customer in the system.*

*Q23 - Is the state change referring to the candidate or to the individual application, and how does it relate to the
enable/disable of users?*

*A23 - The enable/disable of users is only to control access to the system. The state, in the application process, is
the
status of a candidate's application for a job opening, and it is not directly related to the enable/disable of users.*

*Q24 - Is the candidate's ID and the job opening's ID used to identify an application?*

*A24 - Not quite. Applications will enter the system through files generated by the Application Email Bot. These files
are
identified by the Job Reference followed by a "number" that identifies the application to that job reference. It will
typically be a sequential number. The content of these files will contain the candidate's data. Note that the candidate
may not even exist yet (have no record in the system).*

*Q29 - From the perspective of the app file bot, should it represent a service in the system?*

*A29 - Yes, I would argue that it should be considered a service in the system, as it performs a specific function of
transforming received data into a format compatible with the recruitment process.*

*Q31 - Regarding the job specification, should it be the client sending the requirements, or is it the responsibility of
the customer manager? What is the concept of a job specification?*

*A31 - (Some reference to Q25). Typically, it will be the customer who informs the customer manager of the minimum
requirements for a job offer. The customer manager checks if there is already an appropriate requirements specification.
If there isn't one, a new one is created with the help of the Language Engineer.*

*Q33 - Does the candidate have an identification code or is it the email that identifies them?*

*A33 - The candidate is identified by email. There is no need for a code.*

*Q34 - In US3002, when listing job openings, what does "position" mean?*

*A34 - In this user story, when we refer to "position," it has the same meaning as "title or function" in section
2.2.2.*

*Q35 - Does the customer need to have an address and company name, or is it sufficient for this information to be in the
job opening?*

*A35 - We should record the name and address of the customer. For each job opening, the address can be specific (and
different from the customer's address).*

*Q54 Alejandro – Regarding the US2000a requirement which states "As an Operator, I want to register a candidate and create a corresponding user," I would like to know how a candidate will be registered in the system, i.e., understand the processes for registering a candidate. Since the candidate has their name, email, and phone number, how should their username be formatted to avoid conflicts with other candidates' names? Additionally, how should the candidate be notified of their username and password?*

*A54. There is no need for a user name (See Q11). Regarding the password, I think the system can generate a unique password. You may assume the candidate will be informed of his/her password by means that are outside of the scope of what is to be developed for this version of the system.*



*Q76 Abreu – US1005 – Should the list contain applications that have not yet completed the entire selection process defined in the setup of the Job Opening? If yes, should the list contain the status/phase of each application?*

*A76. The selection/recruitment process only ends at the "end", so I don't quite understand the first question. As for the second question, I think it makes sense to include the application status, even for the Customer Manager to understand the applications that were rejected for not meeting the requirements.*

## 3. Analysis and Design

*With indications from the EAPLI PLs teacher and material available in the moodle of the same subject the team tackled
to create the domain model that would represent the project at hand.*
*As said in the project description, there are five main concepts: JobOpening, Customer, Candidate, Plugin and
Application. All of these were turned into entities and had their respective attributes (value objects) attributed to
them.*
*From the project description and all USs in the project, links between the main concepts were made, aggregates were
established and many corrections were done in order to be able to meet the client and USs demands.*

## 4. Implementation

![domain model](Domain_Model_SprintB.svg "Domain Model")

## 5. Observations

*Any justification regarding the Domain Model itself will be explained by the team in the evaluation moments*