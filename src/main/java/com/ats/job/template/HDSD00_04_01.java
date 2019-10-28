package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 西药处方子集
 */
public class HDSD00_04_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_04_01(CDAData cdaData) {
        CDA = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                "\n" +
                "  <realmCode code=\"CN\"/>\n" +
                "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                "  <templateId  root=\"2.16.156.10011.2.1.1.24\"/>\n" +
                "\n" +
                "  <!-- 文档流水号 -->\n" +
                "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                "\n" +
                "  <code code=\"C0004\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"></code>\n" +
                "  <title>西药处方</title>\n" +
                "\n" +
                "  <!-- 文档机器生成时间 -->\n" +
                "  <effectiveTime value=\"20121024154823\"/>\n" +
                "\n" +
                "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                "  <languageCode code=\"zh-CN\"/>\n" +
                "  <setId/>\n" +
                "  <versionNumber/>\n" +
                "\n" +
                "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                "    <patientRole classCode=\"PAT\">\n" +
                "\n" +
                "      <!--门（急）诊号标识 -->\n" +
                "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                "\n" +
                "      <!--处方编号-->\n" +
                "      <id root=\"2.16.156.10011.1.20\" extension=\"" + cdaData.getCustomCol("DE01_00_020_00") + "\"/>\n" +
                "\n" +
                "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "\n" +
                "        <!--患者身份证号标识-->\n" +
                "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                "\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                "\n" +
                "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                "\n" +
                "      </patient>\n" +
                "      <!-- 开立科室 -->\n" +
                "      <providerOrganization>\n" +
                "        <id root=\"2.16.156.10011.1.26\"/>\n" +
                "        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                "        <asOrganizationPartOf>\n" +
                "          <wholeOrganization>\n" +
                "            <!-- 机构代码 -->\n" +
                "            <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                "            <name>机构代码</name>\n" +
                "          </wholeOrganization>\n" +
                "        </asOrganizationPartOf>\n" +
                "      </providerOrganization>\n" +
                "    </patientRole>\n" +
                "  </recordTarget>\n" +
                "\n" +
                "  <!--创建者-->\n" +
                "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                "    <!-- 处方开立日期 -->\n" +
                "    <time value=\"" + cdaData.getCustomCol("DE08_50_033_00") + "\"/>\n" +
                "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                "      <!-- 处方开立医师 -->\n" +
                "      <assignedPerson>\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedAuthor>\n" +
                "  </author>\n" +
                "\n" +
                "  <!-- 保管机构 -->\n" +
                "  <custodian typeCode=\"CST\">\n" +
                "      <assignedCustodian classCode=\"ASSIGNED\">\n" +
                "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                "        <name>xx医院</name>\n" +
                "        </representedCustodianOrganization>\n" +
                "    </assignedCustodian>\n" +
                "  </custodian>\n" +
                "\n" +
                "  <!-- 处方审核药剂师签名 -->\n" +
                "  <legalAuthenticator>\n" +
                "    <time/>\n" +
                "    <signatureCode/>\n" +
                "    <assignedEntity>\n" +
                "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                "      <code displayName=\"处方审核药剂师\"></code>\n" +
                "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedEntity>\n" +
                "  </legalAuthenticator>\n" +
                "\n" +
                "  <!-- 处方调配药剂师签名 -->\n" +
                "  <authenticator>\n" +
                "    <time/>\n" +
                "    <signatureCode/>\n" +
                "    <assignedEntity>\n" +
                "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                "      <code displayName=\"处方调配药剂师\"></code>\n" +
                "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedEntity>\n" +
                "  </authenticator>\n" +
                "\n" +
                "  <!-- 处方核对药剂师 -->\n" +
                "  <authenticator>\n" +
                "    <time/>\n" +
                "    <signatureCode/>\n" +
                "    <assignedEntity>\n" +
                "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                "      <code displayName=\"处方核对药剂师\"></code>\n" +
                "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedEntity>\n" +
                "  </authenticator>\n" +
                "\n" +
                "  <!-- 处方发药药剂师签名 -->\n" +
                "  <authenticator>\n" +
                "    <time/>\n" +
                "    <signatureCode/>\n" +
                "    <assignedEntity>\n" +
                "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                "      <code displayName=\"处方发药药剂师\"></code>\n" +
                "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                "      </assignedPerson>\n" +
                "    </assignedEntity>\n" +
                "  </authenticator>\n" +
                "  <relatedDocument typeCode=\"RPLC\">\n" +
                "    <parentDocument>\n" +
                "      <id/>\n" +
                "      <setId/>\n" +
                "      <versionNumber/>\n" +
                "    </parentDocument>\n" +
                "  </relatedDocument>\n" +
                "\n" +
                "  <component>\n" +
                "    <structuredBody>\n" +
                "\n" +
                "            <!--诊断记录章节-->\n" +
                "      <component>\n" +
                "        <section>\n" +
                "                   <code code=\"29548-5\" displayName=\"Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "                    <!--条目：诊断-->\n" +
                "                    <entry>\n" +
                "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                            <code code=\"DE05.01.024.00\" displayName=\"诊断代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"></value>\n" +
                "                        </observation>\n" +
                "                    </entry>\n" +
                "               </section>\n" +
                "            </component>\n" +
                "\n" +
                "      <!--用药章节 1..*-->\n" +
                "            <component>\n" +
                "                <section>\n" +
                "                    <code code=\"10160-0\" codeSystem=\"2.16.840.1.113883.6.1\" displayName=\"HISTORY OF MEDICATION USE\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "                    <entry>\n" +
                "                        <substanceAdministration classCode=\"SBADM\" moodCode=\"EVN\">\n" +
                "                            <text/>\n" +
                "                            <routeCode code=\"" + cdaData.getCustomCol("DE06_00_134_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.158\" codeSystemName=\"用药途径代码表\"/>\n" +
                "              <!--用药剂量-单次 -->\n" +
                "              <doseQuantity value=\"" + cdaData.getCustomCol("DE08_50_023_00") + "\" unit=\"mg\"/>\n" +
                "              <!--用药频率 -->\n" +
                "              <rateQuantity value=\"" + cdaData.getCustomCol("DE06_00_133_00") + "\" unit=\"次/日\"></rateQuantity>\n" +
                "              <!--药物剂型 -->\n" +
                "              <administrationUnitCode code=\"" + cdaData.getCustomCol("DE08_50_011_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.211\" displayName=\"药物剂型代码表\"></administrationUnitCode>\n" +
                "              <consumable>\n" +
                "                <manufacturedProduct>\n" +
                "                  <manufacturedLabeledDrug>\n" +
                "                    <!--药品代码及名称(通用名) -->\n" +
                "                    <code/>\n" +
                "                    <name>" + cdaData.getCustomCol("DE08_50_022_00") + "</name>\n" +
                "                  </manufacturedLabeledDrug>\n" +
                "                </manufacturedProduct>\n" +
                "              </consumable>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE08.50.043.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"药物规格\"/>\n" +
                "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_043_00") + "</value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "              <entryRelationship typeCode=\"COMP\">\n" +
                "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "                  <code code=\"DE06.00.135.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"药物使用总剂量\"/>\n" +
                "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_135_00") + "\"></value>\n" +
                "                </observation>\n" +
                "              </entryRelationship>\n" +
                "                        </substanceAdministration>\n" +
                "                    </entry>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.294.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"处方有效天数\"/>\n" +
                "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE06_00_294_00") + "\" unit=\"天\"></value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE08.50.056.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"处方药品组号\"/>\n" +
                "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE08_50_056_00") + "\"></value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE06.00.179.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"处方备注信息\"/>\n" +
                "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_179_00") + "</value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "                </section>\n" +
                "            </component>\n" +
                "\n" +
                "      <!--费用章节-->\n" +
                "      <component>\n" +
                "                <section>\n" +
                "                    <code code=\"48768-6\" displayName=\"PAYMENT SOURCES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                "                    <text/>\n" +
                "          <entry>\n" +
                "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                "              <code code=\"DE07.00.004.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"处方药品金额\"/>\n" +
                "              <value xsi:type=\"MO\" value=\"" + cdaData.getCustomCol("DE07_00_004_00") + "\" currency=\"元\"></value>\n" +
                "            </observation>\n" +
                "          </entry>\n" +
                "                </section>\n" +
                "            </component>\n" +
                "    </structuredBody>\n" +
                "  </component>\n" +
                "</ClinicalDocument>";
    }
}
