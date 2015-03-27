namespace MJ_Test
{
    partial class TextMover
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TextMover));
            this.lbl_mvr = new System.Windows.Forms.Label();
            this.btn_start = new System.Windows.Forms.Button();
            this.tmr = new System.Windows.Forms.Timer(this.components);
            this.btn_stop = new System.Windows.Forms.Button();
            this.nxt_btn2 = new System.Windows.Forms.Button();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.SuspendLayout();
            // 
            // lbl_mvr
            // 
            this.lbl_mvr.Font = new System.Drawing.Font("Microsoft Sans Serif", 13.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_mvr.ForeColor = System.Drawing.Color.Yellow;
            this.lbl_mvr.Image = ((System.Drawing.Image)(resources.GetObject("lbl_mvr.Image")));
            this.lbl_mvr.Location = new System.Drawing.Point(74, 118);
            this.lbl_mvr.Name = "lbl_mvr";
            this.lbl_mvr.Size = new System.Drawing.Size(674, 347);
            this.lbl_mvr.TabIndex = 0;
            this.lbl_mvr.Text = "Anon";
            // 
            // btn_start
            // 
            this.btn_start.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_start.Location = new System.Drawing.Point(79, 52);
            this.btn_start.Name = "btn_start";
            this.btn_start.Size = new System.Drawing.Size(106, 40);
            this.btn_start.TabIndex = 1;
            this.btn_start.Text = "Start";
            this.btn_start.UseVisualStyleBackColor = true;
            this.btn_start.Click += new System.EventHandler(this.button1_Click);
            // 
            // tmr
            // 
            this.tmr.Interval = 200;
            this.tmr.Tick += new System.EventHandler(this.tmr_Tick);
            // 
            // btn_stop
            // 
            this.btn_stop.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_stop.Location = new System.Drawing.Point(571, 52);
            this.btn_stop.Name = "btn_stop";
            this.btn_stop.Size = new System.Drawing.Size(106, 40);
            this.btn_stop.TabIndex = 2;
            this.btn_stop.Text = "Stop";
            this.btn_stop.UseVisualStyleBackColor = true;
            this.btn_stop.Click += new System.EventHandler(this.btn_stop_Click);
            // 
            // nxt_btn2
            // 
            this.nxt_btn2.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nxt_btn2.Location = new System.Drawing.Point(788, 470);
            this.nxt_btn2.Name = "nxt_btn2";
            this.nxt_btn2.Size = new System.Drawing.Size(58, 53);
            this.nxt_btn2.TabIndex = 3;
            this.nxt_btn2.Text = ">";
            this.nxt_btn2.UseVisualStyleBackColor = true;
            this.nxt_btn2.Click += new System.EventHandler(this.nxt_btn2_Click);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // TextMover
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(867, 549);
            this.Controls.Add(this.nxt_btn2);
            this.Controls.Add(this.btn_stop);
            this.Controls.Add(this.btn_start);
            this.Controls.Add(this.lbl_mvr);
            this.Name = "TextMover";
            this.Text = "TextMover";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lbl_mvr;
        private System.Windows.Forms.Button btn_start;
        private System.Windows.Forms.Timer tmr;
        private System.Windows.Forms.Button btn_stop;
        private System.Windows.Forms.Button nxt_btn2;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
    }
}